def call( String ProjectName, String ImageTag, String DockerHubUser, String Location, String Args){
  sh "docker build --build-arg ENV_FILE=.demo.env -t ${DockerHubUser}/${ProjectName}-${Location}:${ImageTag} ./${Location}"
  echo "The build is Successfull"
}
