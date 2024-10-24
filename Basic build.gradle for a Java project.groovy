plugins {
    // Apply the java plugin to add support for Java
    id 'java'
    
    // Apply the application plugin to add support for building a CLI application
    id 'application'
}

// Define the group and version for the project
group = 'com.example'
version = '1.0-SNAPSHOT'

// Define the main class for the application
mainClassName = 'com.example.Main'

repositories {
    // Use Maven Central for resolving dependencies
    mavenCentral()
}

dependencies {
    // Use JUnit 5 for testing
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
    
    // Add additional dependencies here
    // For example, if you're building a web application with Spring:
    // implementation 'org.springframework.boot:spring-boot-starter-web'

    // Or if you're using a logging library:
    // implementation 'org.slf4j:slf4j-api:1.7.30'
    // implementation 'org.slf4j:slf4j-simple:1.7.30'
}

test {
    // Use JUnit Platform for unit tests
    useJUnitPlatform()
}

// Configure application distribution
application {
    applicationName = 'myapp'
}

// Define Java version compatibility
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
