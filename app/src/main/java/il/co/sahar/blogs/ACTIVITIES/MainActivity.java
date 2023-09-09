package il.co.sahar.blogs.ACTIVITIES;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import il.co.sahar.blogs.R;


public class MainActivity extends BaseActivity {

    private Button btnAddPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }

    @Override
    protected void initializeViews() {
        btnAddPost = findViewById(R.id.btnAddPost);

        setListeners();
    }

    @Override
    protected void setListeners() {
        //no need
    }
    public void addPost(View view)
    {
        Intent intent=new Intent(this,BlogPostActivity.class);
        startActivity(intent);
    }

}