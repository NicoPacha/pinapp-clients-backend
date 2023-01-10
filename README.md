
![Logo](https://media.licdn.com/dms/image/C4D16AQEb5rcblq3BsA/profile-displaybackgroundimage-shrink_350_1400/0/1662670920083?e=1678924800&v=beta&t=HIGxb7GqDObcCcL7ses2qc8D4LFxGmAnAa_GjJ9uGYc)



# Pinapp clients BACKEND

Este proyecto esta creado en JAVA 17 con spring boot, para crear nuevos clientes , listar clientes, y ver las estadisticas de los mismos.


### URL de la API?

http://ec2-35-173-177-123.compute-1.amazonaws.com:443/api

### Swagger

http://ec2-35-173-177-123.compute-1.amazonaws.com:443/swagger-ui


#### ENDPOINTS :

* Nuevo cliente (POST): 
http://ec2-35-173-177-123.compute-1.amazonaws.com:443/api/client

* Listar Clientes (GET): 
http://ec2-35-173-177-123.compute-1.amazonaws.com:443/api

* Kpi de los clientes (GET):
http://ec2-35-173-177-123.compute-1.amazonaws.com:443/api/client/kpi





#### Como correr el proyecto ? (Es necesario tener java)

En la raiz del directorio correr
```bash
    ./mvnw spring-boot:run

```

Para buildear JAR
```bash
    ./mvnw clean package

```
    
   