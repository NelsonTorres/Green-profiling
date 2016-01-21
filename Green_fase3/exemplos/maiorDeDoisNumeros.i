void main() {

    energia();
    energia();
    int a;
    int b;
    int res;
    a = input(int);
    energia();
    b = input(int);
    res = max(a,b);
    print('=');
    print(res);
    energia();
}

int max(int a, int b){
    int res;
    if (a > b) {
        res = a;
    }
    else {
        res = b;
    }
    return res; 
}
