def call(String Directory){
  dir("${Directory}"){
  dependencyCheck additionalArguments: '--scan .', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: "**/dependency-check-report-${Directory}.xml"
  }
}
