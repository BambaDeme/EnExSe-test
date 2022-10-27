# Java/SpringBoot Api Test

Mini application avec **Java**/**SpringBoot**.



## Docker-compose
Le fichier docker-compose à la racine permet de lancer un service mysql et un service phpmyadmin pour visualiser la base de données.<br>
Lancer la commande `docker-compose up` pour démarrer les conteneurs.
## Lancer l'application
Une fois les services démarrées, on peut lancer l'application qui écoutera sur le port 8082.
- [**GET**] api/v1/agents: pour la liste des agents
- [**POST**] api/v1/agent: pour ajouter un agent
- [**PUT**] api/v1/{agentName} : pour modifier un agent 
- [**DELETE**] api/v1/{agentId} : pour supprimer un agent

## Example requêtes
### Insomnia
### Liste d'agents vide au début: GET
![Screenshot Liste d'agents vide](https://raw.githubusercontent.com/bambademe/enexse-test/main/src/main/resources/static/images/Screenshot-get1.png)

### Ajout d'agents: POST
![Screenshot Ajout d'un agent](https://raw.githubusercontent.com/bambademe/enexse-test/main/src/main/resources/static/images/Screenshot-post1.png)
![Screenshot Ajout d'un deuxième agent](https://raw.githubusercontent.com/bambademe/enexse-test/main/src/main/resources/static/images/Screenshot-post2.png)
![Screenshot Ajout d'un troisième agent](https://raw.githubusercontent.com/bambademe/enexse-test/main/src/main/resources/static/images/Screenshot-post3.png)

### Liste aprés ajout: GET
![Screenshot Liste avec 3 agents](https://raw.githubusercontent.com/bambademe/enexse-test/main/src/main/resources/static/images/Screenshot-get2.png)

### Update
#### Update agent with name `cyr-customer-ossec.local` and set status to `disconnected`
![Screenshot Modifier un agent](https://raw.githubusercontent.com/bambademe/enexse-test/main/src/main/resources/static/images/Screenshot-put1.png)

### Delete
#### Delete agent with id 7
![Screenshot Supprimer un agent](https://raw.githubusercontent.com/bambademe/enexse-test/main/src/main/resources/static/images/Screenshot-delete1.png)

### Liste aprés modification et suppression
![Screenshot Supprimer un agent](https://raw.githubusercontent.com/bambademe/enexse-test/main/src/main/resources/static/images/Screenshot-final.png)

[//]: # (### CURL)

[//]: # (```)

[//]: # ()
[//]: # (```)