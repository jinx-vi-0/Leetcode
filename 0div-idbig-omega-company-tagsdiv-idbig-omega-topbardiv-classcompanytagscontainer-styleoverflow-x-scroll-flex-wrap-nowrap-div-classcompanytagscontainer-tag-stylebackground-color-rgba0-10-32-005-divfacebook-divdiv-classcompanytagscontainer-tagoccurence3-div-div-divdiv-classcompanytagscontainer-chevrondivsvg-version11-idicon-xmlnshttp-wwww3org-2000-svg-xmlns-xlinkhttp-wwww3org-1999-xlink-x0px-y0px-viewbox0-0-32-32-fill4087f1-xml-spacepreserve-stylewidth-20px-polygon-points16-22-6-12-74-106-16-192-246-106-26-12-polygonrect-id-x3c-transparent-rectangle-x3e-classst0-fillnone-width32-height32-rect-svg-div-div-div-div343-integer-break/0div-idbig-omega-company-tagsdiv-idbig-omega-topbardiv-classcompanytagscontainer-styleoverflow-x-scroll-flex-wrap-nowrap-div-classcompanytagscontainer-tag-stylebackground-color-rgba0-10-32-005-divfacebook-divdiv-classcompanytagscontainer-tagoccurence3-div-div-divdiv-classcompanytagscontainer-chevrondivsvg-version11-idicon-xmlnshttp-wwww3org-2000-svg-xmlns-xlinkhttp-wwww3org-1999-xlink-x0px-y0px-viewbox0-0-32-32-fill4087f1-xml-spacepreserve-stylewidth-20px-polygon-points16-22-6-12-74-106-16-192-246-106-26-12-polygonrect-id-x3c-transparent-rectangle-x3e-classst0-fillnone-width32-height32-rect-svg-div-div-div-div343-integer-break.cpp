class Solution {
public:
    int integerBreak(int n) {
        if(n==2 || n==3){
            return n-1;
            
        }
        int product=1;
        while(n>4){
            product=product*3;
            cout<<n<<endl;
            n-=3;
            
        }
        return n*product;
    }
};