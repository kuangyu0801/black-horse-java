```
# compile all java files in source folder
cd src
javac -d ../classes *.java

# generate stub with .class file
cd ../classes
rmic MyRemoteImpl

# start rmiregistry
rmiregistry 5000 &

# start server
java MyRemoteServer &

# start client
java MyReMoteClient
```