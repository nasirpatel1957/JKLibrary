def call() {
    sh 'mvn clean install'
}

//ensure .jar file is created in /workspace/target/*.jar