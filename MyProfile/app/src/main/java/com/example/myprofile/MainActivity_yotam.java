
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


    static  int likecount =0;



    public void likeClick (View view){
        TextView likeCnt =(TextView)findViewById(R.id.likeCnt);
        likecount++;
        likeCnt.setText(String.valueOf(likecount));


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
