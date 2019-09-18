build_dir:
	mkdir -p build

compile: build_dir
	javac -d ./build *.java

package: compile
	(cd build ; jar cvf ../Person.jar *)
