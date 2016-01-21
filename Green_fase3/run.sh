#/bin/bash
EXAMPLE_DIR=exemplos/
EXAMPLE_FILE=fatorial.i
RES_FILE=res.msp
make all
cp $EXAMPLE_DIR$EXAMPLE_FILE genI
cd genI
javac gram/Main.java
java gram/Main < $EXAMPLE_FILE > $RES_FILE

cp $RES_FILE ../genMaqV

cd ../energy
javac EnergyCheckUtils.java
javac EnergyExample.java
cp EnergyExample.class EnergyCheckUtils.class libCPUScaler.so ../genMaqV/
cd ../genMaqV
sudo modprobe msr
javac maqv/Main.java
java maqv/Main $RES_FILE
