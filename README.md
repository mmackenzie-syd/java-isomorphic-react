# isomorphic-javascript-nashorn-example

Example of isomorphic rendering of reactJS components using Nashorn.

## Nashorn

Nashorn is Java’s embedded JavaScript engine that comes part of Java 8.  Nashorn will compile JavaScript to Java bytecode providing interoperability between Java and JavaScript code.  

This repo demonstrates running server-side render of a react component using Java.  It uses maven and spring-boot to compile and launch an embedded web server (but, in general, these are not required for doing server-side rendering of reactJS components using Nashorn)

## Installation instructions

```
npm install
```

```
npm run build
```

To run:

```
mvn spring-boot:run
```

Then go to: http://localhost:8080/
