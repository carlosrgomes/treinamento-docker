# Exemplos de Código - Treinamento Docker

Estes projetos são exemplos de código e projetos para melhor
entendimento do conteúdo do treinamento docker

### Requisitos

Para conseguir utilizar os projetos do treinamento é necessários instalar o docker, eclipse, JDK e postman:

* Link da Instalação Docker: [https://docs.docker.com/engine/installation/]
* Link eclipse: [https://www.eclipse.org/downloads/]
* Link JDK: [http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html]
* Link da extensão do chrome Postman [https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop]

### Testes do Webservices Rest

Link para teste no postman: [https://www.getpostman.com/collections/99c5b301d194ce808a7c]

### Docker Compose
1. Criar Django Project - docker-compose run web django-admin.py startproject composeexample .
2. Alterar configurações do banco de dados composeexample/settings.py
```java
DATABASES = {
    'default': {
        'ENGINE': 'django.db.backends.postgresql_psycopg2',
        'NAME': 'postgres',
        'USER': 'postgres',
        'HOST': 'db',
        'PORT': 5432,
    }
}
```
3. subir o docker compose docker-compose up
