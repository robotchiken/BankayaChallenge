package com.pokeapi.repositories;


import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.pokeapi.dto.Ability__1;
import com.pokeapi.dto.HeldItem;
import com.pokeapi.dto.Item;
import com.pokeapi.dto.PokemonInfo;
import com.pokeapi.dto.VersionDetail;
import com.pokeapi.dto.Version__1;
import com.pokeapi.entities.RequestInfo;

import io.spring.challenge.pokeapi.Ability;
import io.spring.challenge.pokeapi.GetAbilitiesResponse;
import io.spring.challenge.pokeapi.GetAbilitiesResponse.Abilities;
import io.spring.challenge.pokeapi.GetBaseExperienceResponse;
import io.spring.challenge.pokeapi.GetHeldItemsResponse;
import io.spring.challenge.pokeapi.GetHeldItemsResponse.HeldItems;
import io.spring.challenge.pokeapi.GetHeldItemsResponse.HeldItems.VersionDetails;
import io.spring.challenge.pokeapi.GetIdResponse;
import io.spring.challenge.pokeapi.GetLocationAreaEncountersResponse;
import io.spring.challenge.pokeapi.GetNameResponse;

@Component
public class PokemonRepository {
	
	@Autowired
	private WebClient webclient;
	
	@Autowired
	private RequestInfoRepository requestInfoRepository;
	
	public PokemonRepository() {
	}
	private PokemonInfo getPokemonInfo(String name) {
		return webclient.get().uri("/api/v2/pokemon/"+name+"/").retrieve().bodyToMono(PokemonInfo.class).block();
	}

	public GetAbilitiesResponse getPokemonAbilities(String name, String remoteAddr, String methodName) {
		this.saveRequestInfo(remoteAddr,methodName);
		PokemonInfo pokemonInfo = this.getPokemonInfo(name);
		return this.getAbilitiesResponse(pokemonInfo.getAbilities());
	}

	public GetBaseExperienceResponse getBaseExperience(String name, String remoteAddr, String methodName) {
		this.saveRequestInfo(remoteAddr,methodName);
		PokemonInfo pokemonInfo  = this.getPokemonInfo(name);
		GetBaseExperienceResponse response = new GetBaseExperienceResponse();
		response.setBaseExperience(pokemonInfo.getBaseExperience());
		return response;
	}
	public GetHeldItemsResponse getHeldItems(String name, String remoteAddr, String methodName) {		
		this.saveRequestInfo(remoteAddr,methodName);
		PokemonInfo pokemonInfo  = this.getPokemonInfo(name);
		GetHeldItemsResponse response = null;
		if(!pokemonInfo.getHeldItems().isEmpty()) {
			response = new GetHeldItemsResponse();
			
			for(HeldItem heldItem: pokemonInfo.getHeldItems()) {
				HeldItems heldItemsResponse = new HeldItems();
				Ability itemTarget = new Ability();
				Item itemSource = heldItem.getItem();				
				BeanUtils.copyProperties(itemSource, itemTarget);
				io.spring.challenge.pokeapi.GetHeldItemsResponse.HeldItems.Item tmp = new io.spring.challenge.pokeapi.GetHeldItemsResponse.HeldItems.Item();
				tmp.setItem(itemTarget);
				heldItemsResponse.setItem(tmp);
				for(VersionDetail versionSource : heldItem.getVersionDetails()) {
					VersionDetails versionTarget = new VersionDetails();
					Version__1 version_1source = versionSource.getVersion();
					Ability abilityTarget = new Ability();
					BeanUtils.copyProperties(versionSource, versionTarget);
					BeanUtils.copyProperties(version_1source, abilityTarget);
					versionTarget.setVersion(abilityTarget);
					heldItemsResponse.getVersionDetails().add(versionTarget);
				}
				response.getHeldItems().add(heldItemsResponse);
			}
		}
		return response;
	}
	public GetIdResponse getPokemonId(String name, String remoteAddr, String methodName) {
		this.saveRequestInfo(remoteAddr,methodName);
		PokemonInfo pokemonInfo  = this.getPokemonInfo(name);
		GetIdResponse response = new GetIdResponse();
		response.setId(pokemonInfo.getId());		
		return response;
	}
	public GetNameResponse getPokemonName(String name, String remoteAddr, String methodName) {
		this.saveRequestInfo(remoteAddr,methodName);
		PokemonInfo pokemonInfo  = this.getPokemonInfo(name);
		GetNameResponse response = new GetNameResponse();
		response.setName(pokemonInfo.getName());
		return response;
	}
	public GetLocationAreaEncountersResponse getLocationAreaEncounters(String name, String remoteAddr, String methodName) {
		this.saveRequestInfo(remoteAddr,methodName);
		PokemonInfo pokemonInfo  = this.getPokemonInfo(name);
		GetLocationAreaEncountersResponse response = new GetLocationAreaEncountersResponse();
		response.setLocationAreaEncounters(pokemonInfo.getLocationAreaEncounters());
		return response;
	}
	
	private GetAbilitiesResponse getAbilitiesResponse(final List<com.pokeapi.dto.Ability> listAbilities) {		
		GetAbilitiesResponse response = null;
		if(!listAbilities.isEmpty()) {
			response = new GetAbilitiesResponse();
			for(com.pokeapi.dto.Ability ability : listAbilities) {
				Abilities abilities = new Abilities();
				Ability__1 ability_1 = ability.getAbility();
				Ability ability2 = new Ability();
				BeanUtils.copyProperties(ability, abilities);
				BeanUtils.copyProperties(ability_1, ability2);
				abilities.setAbility(ability2);
				response.getAbilities().add(abilities);
			}
		}
		return response;
	}
	
	private void saveRequestInfo(String remoteAddr, String methodName) {
		RequestInfo entity = new RequestInfo();
		entity.setMethodName(methodName);
		entity.setRemoteAddr(remoteAddr);
		entity.setRequestDate(new Date());
		this.requestInfoRepository.save(entity);
	}

}
