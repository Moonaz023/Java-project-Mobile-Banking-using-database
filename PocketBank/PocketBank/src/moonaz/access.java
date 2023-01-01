package moonaz;

public abstract class access {
    String id,pasward;
    access(String id ,String pasward){
        this.id=id;
        this.pasward=pasward;
    }
    public abstract  int loogin();
}
