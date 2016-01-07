void main() {
	int num;
	num = input(int);
	int resI; int resR;
	energia();
	resI = fatorialI(num);
	energia();
	resR = fatorialR(num);
	energia();
	print(resI);
	print(resR);
}

int fatorialI(int num){
	int fat;
	for(fat = 1; num > 1; num--){
		fat = fat * num;
	}
	return fat;
}

int fatorialR(int num){
	if (num==1 || num==0){
		return 1;
	}else{
		return num*fatorialR(num-1);
	}
}