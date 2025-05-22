def call(String Directory){
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: "**/dependency-check-report-${Directory}.xml"
}
