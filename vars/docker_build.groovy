def call( String ProjectName, String ImageTag, String DockerHubUser, String Location){
  sh "docker build --no-cache -t ${DockerHubUser}/${ProjectName}-${Location}:${ImageTag} ./${Location}"
  echo "The build is Successfull"
}
