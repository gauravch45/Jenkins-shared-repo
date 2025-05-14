def call(){
  sh "trivy fs . > trivy-report.txt || true"
}
