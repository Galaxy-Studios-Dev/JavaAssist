[![](https://jitpack.io/v/Galaxy-Studios-Dev/JavaAssist.svg)](https://jitpack.io/#Galaxy-Studios-Dev/JavaAssist)


# Maven
```
<repositories>
   <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
   </repository>
</repositories>

<dependencies>
   <dependency>
      <groupId>com.github.Galaxy-Studios-Dev</groupId>
      <artifactId>JavaAssist</artifactId>
      <version>Tag</version>
   </dependency>
</dependencies>
```

# Gradle
```
dependencyResolutionManagement {
   repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
      repositories {
         mavenCentral()
         maven { url 'https://jitpack.io' }
   }
}

dependencies {
   implementation 'com.github.Galaxy-Studios-Dev:JavaAssist:Tag'
}
```
