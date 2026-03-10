#include<iostream>
#include<string.h>
using namespace std;
class Room {
   public:
   string i;
   int z;  
   Room(){
    cout<<"this is default constructor"<<i<<endl;
   }
  Room(int q){
    z = q;
    cout<<"this is parameterized constructor"<<q<<endl;
} Room(const Room & s){
    z=s.z;
    cout<<"this is copy conctructor"<<z<<endl;
}
};
int main() {
    Room s1;
    s1.i = "lanja";
    Room s2(10);
    Room s3 = s2;
    return 0;
}