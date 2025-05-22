def call( String ProjectName, String ImageTag, String DockerHubUser, String Location){
  sh "docker build --build-arg ENV_FILE=.env -t ${DockerHubUser}/${ProjectName}-${Location}:${ImageTag} ./${Location}"
  echo "The build is Successfull"
}
