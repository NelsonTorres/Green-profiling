1 - Create Java Native Interface files (Only need to run once unless you change JNI files)
	> make

2 - Initialize Model-specific register (Once per system restart)
	> sudo modprobe msr

3 - Run your Java project in sudo (Everytime)
	> sudo java ClassName