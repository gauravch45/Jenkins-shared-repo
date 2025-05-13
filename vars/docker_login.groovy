def call(String Cred_id){
  withCredentials([usernamePassword(
    credentialsId: "${Cred_id}", 
    passwordVariable: 'docker_pass',
    usernameVariable: 'docker_user')]) {
      try {sh """
           echo "${docker_pass}" | docker login -u "${docker_user}" --password-stdin
                                    """
                                    echo "Login Success"
                                } catch(err){
                                    echo "Login Failed - ${err.getMessage()}"
                                    error("Stopping Pipeline due to dockerhub login failure")
                                }
                        }
}
