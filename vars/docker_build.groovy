def call( String ProjectName, String ImageTag, String DockerHubUser, String Location, String Args){
  sh "docker build --build-arg ENV_FILE=${Args} --no-cache -t ${DockerHubUser}/${ProjectName}-${Location}:${ImageTag} ./${Location}"
  echo "The build is Successfull"
}
