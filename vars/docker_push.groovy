def call( String Project, String Imagetag, String dockerhubuser){
  withCredentials([usernamePassword('credentialsId':"dockerHubCred", passwordVariable:"dockerHubPass", usernameVariable:"dockerHubUser")]){
                    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"      
                }
  sh "docker push ${dockerhubuser}/"${Project}":"${Imagetag}""
}
