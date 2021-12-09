# Challenge Bankaya 

## Url del Webservice

```
http://localhost:8080/ws/
```

## SOAP Requests

### Abilities
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="http://spring.io/challenge/pokeapi">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getAbilitiesRequest>
         <gs:name>pokemonName</gs:name>
      </gs:getAbilitiesRequest>
   </soapenv:Body>
</soapenv:Envelope>
```
### Held Items
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="http://spring.io/challenge/pokeapi">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getHeldItemsRequest>
         <gs:name>pokemonName</gs:name>
      </gs:getHeldItemsRequest>
   </soapenv:Body>
</soapenv:Envelope>
```
### Base Experience
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="http://spring.io/challenge/pokeapi">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getBaseExperienceRequest>
         <gs:name>pokemonName</gs:name>
      </gs:getBaseExperienceRequest>
   </soapenv:Body>
</soapenv:Envelope>
```
### Location Area Encounters
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="http://spring.io/challenge/pokeapi">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getLocationAreaEncountersRequest>
         <gs:name>pokemonName</gs:name>
      </gs:getLocationAreaEncountersRequest>
   </soapenv:Body>
</soapenv:Envelope>
```
### Name
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="http://spring.io/challenge/pokeapi">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getNameRequest>
         <gs:name>pokemonName</gs:name>
      </gs:getNameRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

### Id
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="http://spring.io/challenge/pokeapi">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getIdRequest>
         <gs:name>pokemonName</gs:name>
      </gs:getIdRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

## Ejemplo de respuestas
### Consulta de habilidades para el pokemon Pikachu
```
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:getAbilitiesResponse xmlns:ns2="http://spring.io/challenge/pokeapi">
            <ns2:abilities>
                <ns2:is_hidden>false</ns2:is_hidden>
                <ns2:slot>1</ns2:slot>
                <ns2:ability>
                    <ns2:name>static</ns2:name>
                    <ns2:url>https://pokeapi.co/api/v2/ability/9/</ns2:url>
                </ns2:ability>
            </ns2:abilities>
            <ns2:abilities>
                <ns2:is_hidden>true</ns2:is_hidden>
                <ns2:slot>3</ns2:slot>
                <ns2:ability>
                    <ns2:name>lightning-rod</ns2:name>
                    <ns2:url>https://pokeapi.co/api/v2/ability/31/</ns2:url>
                </ns2:ability>
            </ns2:abilities>
        </ns2:getAbilitiesResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```
### Consulta de held items para el pokemon pikachu
```
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:getHeldItemsResponse xmlns:ns2="http://spring.io/challenge/pokeapi">
            <ns2:held_items>
                <ns2:item>
                    <ns2:item>
                        <ns2:name>oran-berry</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/item/132/</ns2:url>
                    </ns2:item>
                </ns2:item>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>ruby</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/7/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>sapphire</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/8/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>emerald</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/9/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>diamond</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/12/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>pearl</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/13/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>platinum</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/14/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>heartgold</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/15/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>soulsilver</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/16/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>black</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/17/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>50</ns2:rarity>
                    <ns2:version>
                        <ns2:name>white</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/18/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
            </ns2:held_items>
            <ns2:held_items>
                <ns2:item>
                    <ns2:item>
                        <ns2:name>light-ball</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/item/213/</ns2:url>
                    </ns2:item>
                </ns2:item>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>ruby</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/7/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>sapphire</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/8/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>emerald</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/9/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>diamond</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/12/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>pearl</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/13/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>platinum</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/14/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>heartgold</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/15/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>soulsilver</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/16/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>1</ns2:rarity>
                    <ns2:version>
                        <ns2:name>black</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/17/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>1</ns2:rarity>
                    <ns2:version>
                        <ns2:name>white</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/18/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>black-2</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/21/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>white-2</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/22/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>x</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/23/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>y</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/24/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>omega-ruby</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/25/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>alpha-sapphire</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/26/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>sun</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/27/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>moon</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/28/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>ultra-sun</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/29/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
                <ns2:version_details>
                    <ns2:rarity>5</ns2:rarity>
                    <ns2:version>
                        <ns2:name>ultra-moon</ns2:name>
                        <ns2:url>https://pokeapi.co/api/v2/version/30/</ns2:url>
                    </ns2:version>
                </ns2:version_details>
            </ns2:held_items>
        </ns2:getHeldItemsResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```
## Consulta de datos de request
La información de la ip de la de que hace el request, el metodo que se ejecuta y el dia del request se almacena en una Base de datos H2 en un archivo.

Si se desea consultar la consola de H2 se puede hacer usando la url:
```
http://localhost:8080/h2-console
```
La JDBC URL es la siguiente:
```
jdbc:h2:file:~/spring-boot-h2-db
```
Usuario: sa
Password:password

La base de datos de llama *REQUEST_INFO*

