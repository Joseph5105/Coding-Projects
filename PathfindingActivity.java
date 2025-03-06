package utsa.edu.cs3443_map_project;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.ComponentActivity;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PathfindingActivity extends ComponentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pathfinding);

        Bundle extras = getIntent().getExtras();
        int id = 0;
        if (extras != null) {
            id = extras.getInt("id");
        }
        buttonSetter(id);

    }

    private void buttonSetter(int id) {

        Button button = (Button) findViewById(R.id.TODO);
        Button pathB = (Button)findViewById(R.id.pathButton);
        Button mapB = (Button)findViewById(R.id.mapButton);
        Button faqB = (Button)findViewById(R.id.faqButton);
        Button profileB = (Button)findViewById(R.id.profileButton);
        pathB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PathfindingActivity.this, PathfindingActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });
        mapB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PathfindingActivity.this, MainMenuActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });
        faqB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PathfindingActivity.this, faqActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });
        profileB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(PathfindingActivity.this, ProfileActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText fromBuilding = findViewById(R.id.fromBuildingInput);
                EditText toBuilding = findViewById(R.id.toBuildingInput);
                EditText fromRoom = findViewById(R.id.fromRoomInput);
                EditText toRoom = findViewById(R.id.toRoomInput);

                String fromBuildingText = fromBuilding.getText().toString();
                String toBuildingText = toBuilding.getText().toString();
                String fromRoomText = fromRoom.getText().toString();
                String toRoomText = toRoom.getText().toString();

                Intent intent = new Intent(PathfindingActivity.this, RoomMapJPL.class);
                intent.putExtra("fromBuilding", fromBuildingText);
                intent.putExtra("fromRoom", fromRoomText);
                intent.putExtra("toBuilding", toBuildingText);
                intent.putExtra("toRoom", toRoomText);
                startActivity(intent);
            }
        });
    }
}