package com.pokeapi.endppoint;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pokeapi.repositories.PokemonRepository;

import io.spring.challenge.pokeapi.GetAbilitiesRequest;
import io.spring.challenge.pokeapi.GetAbilitiesResponse;
import io.spring.challenge.pokeapi.GetBaseExperienceRequest;
import io.spring.challenge.pokeapi.GetBaseExperienceResponse;
import io.spring.challenge.pokeapi.GetHeldItemsRequest;
import io.spring.challenge.pokeapi.GetHeldItemsResponse;
import io.spring.challenge.pokeapi.GetIdRequest;
import io.spring.challenge.pokeapi.GetIdResponse;
import io.spring.challenge.pokeapi.GetLocationAreaEncountersRequest;
import io.spring.challenge.pokeapi.GetLocationAreaEncountersResponse;
import io.spring.challenge.pokeapi.GetNameRequest;
import io.spring.challenge.pokeapi.GetNameResponse;

@Endpoint
public class PokemonEndpoint {
	private static final String GET_LOCATION_AREA_ENCOUNTERS_REQUEST = "getLocationAreaEncountersRequest";
	private static final String GET_NAME_REQUEST = "getNameRequest";
	private static final String GET_ID_REQUEST = "getIdRequest";
	private static final String GET_HELD_ITEMS_REQUEST = "getHeldItemsRequest";
	private static final String GET_BASE_EXPERIENCE_REQUEST = "getBaseExperienceRequest";
	private static final String GET_ABILITIES_REQUEST = "getAbilitiesRequest";
	private static final String NAMESPACE_URI = "http://spring.io/challenge/pokeapi";
	
	@Autowired
	private PokemonRepository repository;

	@Autowired
	private HttpServletRequest httpServletRequest;
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_ABILITIES_REQUEST)
	@ResponsePayload
	public GetAbilitiesResponse getAbilities(@RequestPayload GetAbilitiesRequest request) {
		return this.repository.getPokemonAbilities(request.getName(),this.httpServletRequest.getRemoteAddr(),GET_ABILITIES_REQUEST);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_BASE_EXPERIENCE_REQUEST)
	@ResponsePayload
	public GetBaseExperienceResponse getBaseExperience(@RequestPayload GetBaseExperienceRequest request) {
		return this.repository.getBaseExperience(request.getName(),this.httpServletRequest.getRemoteAddr(),GET_BASE_EXPERIENCE_REQUEST);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_HELD_ITEMS_REQUEST)
	@ResponsePayload
	public GetHeldItemsResponse getBaseExperience(@RequestPayload GetHeldItemsRequest request) {
		return this.repository.getHeldItems(request.getName(),this.httpServletRequest.getRemoteAddr(),GET_HELD_ITEMS_REQUEST);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_ID_REQUEST)
	@ResponsePayload
	public GetIdResponse getPokemonId(@RequestPayload GetIdRequest request) {
		return this.repository.getPokemonId(request.getName(),this.httpServletRequest.getRemoteAddr(),GET_ID_REQUEST);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_NAME_REQUEST)
	@ResponsePayload
	public GetNameResponse getPokemonName(@RequestPayload GetNameRequest request) {
		return this.repository.getPokemonName(request.getName(),this.httpServletRequest.getRemoteAddr(),GET_NAME_REQUEST);
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = GET_LOCATION_AREA_ENCOUNTERS_REQUEST)
	@ResponsePayload
	public GetLocationAreaEncountersResponse getPokemonName(@RequestPayload GetLocationAreaEncountersRequest request) {
		return this.repository.getLocationAreaEncounters(request.getName(),this.httpServletRequest.getRemoteAddr(),GET_LOCATION_AREA_ENCOUNTERS_REQUEST);
	}
}
