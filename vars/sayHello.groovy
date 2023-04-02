//https://phoenixnap.com/kb/jenkins-shared-library
// vars/sayHello.groovy
def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello there, ${name}."
}
