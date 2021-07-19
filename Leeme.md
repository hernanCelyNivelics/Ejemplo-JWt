# JWT-JSON WEB TOKEN

## ESTRUCTURA

-JWT representa una secuencia de valores codificados en base64url que están separados por caracteres de punto.
	-HEADER
	-PAYLOAD
	-SIGNATURE

## HEADER

Contiene los metadatos que definen la tecnologia con la que se ecripta el token.

### Tipos de algoritmos de encriptacion.
	
	-HS256
	-HS384
	-HS512
	-RS256
	-RS384
	-RS512
	-ES256
	-ES384
	-ES512

## PAYLOAD

Es la informacion que se esta enviando en el token.
Dentro de este se encuentran los JWT Claims.

	: iss -> identifica el proveedor que emitio el JWT
	: sub -> Identifica el sujeto del JWt
	: aud -> Identifica para quien va el token, si este campo 	esta vacio el token debe ser rechazado.
	: exp -> El tiempo en el que el token no debe ser aceptaod 	si ya paso este tiempo.
	: nbf -> Tiempo que determina a partir de cuando puede ser 	usado.
	: iat -> Hora en la que se emitio el token.
	: jti -> Identificador unico del token.

## SIGNATURE

Es la firma de seguridad
| HEADER    | PAYLOAD | SIGNATURE | 
| -- | -- | -- |
| "typ":"JWT","alg":"HS256" | "iss":"LoginApp","cedula":"123415" | "iss":"LoginApp","cedula":"123415" | var str=base64Encode |


## CICLO DE VIDA DE UNA PETICION JWT

1. El usuario hace una peticion(GET,POST...)
2. El servidor comprueba si existe un token, si no lo crea y lo firma.
3. El servidor devuelve el token
4. El navegador ya tiene un token y con cada peticion incluye este token en la cabecera
5. Se comprueba la firma del JWT contiene la autorizacion valida.
6. se envia la respuesta al cliente




