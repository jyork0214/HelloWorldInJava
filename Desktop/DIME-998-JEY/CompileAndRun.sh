
# REMOVE OLD COPY OF PROJECT.
cd /Users/jamesyork/Desktop/DIME-998-JEY
rm -rf odrive-pdf-service

# GET LASTEST VERSION OF PROJECT.
docker login docker.artifactory.code.dicelab.net
git clone --single-branch --branch DIME-998-JEY  https://gitlab.code.dicelab.net/ado/services/object-drive/odrive-pdf-service.git
git switch DIME-998-JEY
git add .

# COMPILE THE JAVA PROJECT.
cd /Users/jamesyork/Desktop/DIME-998-JEY/odrive-pdf-service
mvn package

# CREATE DOCKER IMAGE.
docker rmi -f odrive-pdf-service-image docker.artifactory.code.dicelab.net/ado/services/odrive-pdf-service:env
docker build --progress plain -t odrive-pdf-service-image -f docker/Dockerfile . 
docker tag odrive-pdf-service-image docker.artifactory.code.dicelab.net/ado/services/odrive-pdf-service:env

# UPLOAD PROJECT TO GITLAB.
git commit -m 'Updated 15MAR2022@1131'
git push origin DIME-998-JEY 

# UPLOAD DOCKER IMAGE TO ARTIFACTORY.
docker login docker.artifactory.code.dicelab.net
docker image push docker.artifactory.code.dicelab.net/ado/services/odrive-pdf-service:env

