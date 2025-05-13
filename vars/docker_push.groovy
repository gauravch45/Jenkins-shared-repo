def call( String Project, String Imagetag, String dockerhubuser, String Location){
  sh "docker push ${dockerhubuser}/${Project}-${Location}:${Imagetag}"
}
