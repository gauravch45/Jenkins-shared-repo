def call( String ProjectName, String ImageTag, String DockerHubUser, String Location){
  sh "docker buildx build -t ${DockerHubUser}/${ProjectName}-${Location}:${ImageTag} ./${Location}"
  echo "The build is Successfull"
}
