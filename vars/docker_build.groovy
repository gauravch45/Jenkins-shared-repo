def call( String ProjectName, String ImageTag, String DockerHubUser, String Location){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ./${Location}"
  echo "The build is Successfull"
}
