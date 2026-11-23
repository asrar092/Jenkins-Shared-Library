def call( project_name){
  sh docker build -t "${project_name}" .
}
