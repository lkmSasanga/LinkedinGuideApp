package lkmSoft.guideforlinkedin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<String> tips = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        tips.add("1. Put in the Time to Make it Awesome");
        tips.add("2. Get a Custom URL");
        tips.add("3. Choose a Great Photo");
        tips.add("4. Write a Headline That Rocks");
        tips.add("5. Use Your Target Job Descriptions to Your Advantage");
        tips.add("6. Don’t Waste the Summary Space");
        tips.add("7. Use Numbers Right Up Front");
        tips.add("8. Be Warm and Welcoming");
        tips.add("9. Avoid Buzzwords Like the Plague");
        tips.add("10. Treat Your Profile Like Your Resume");
        tips.add("11. But Use the First Person");
        tips.add("12. Get Personal");




        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,tips);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {
                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(), activity1.class);
                        startActivity(intent0);
                        break;

                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), activity2.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), activity3.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), activity4new.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), activity5.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(), activity6.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(), activity7.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(getApplicationContext(), activity8.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getApplicationContext(), activity9.class);
                        startActivity(intent8);
                        break;

                    case 9:
                        Intent intent9 = new Intent(getApplicationContext(), activity10.class);
                        startActivity(intent9);
                        break;

                    case 10:
                        Intent intent10 = new Intent(getApplicationContext(), activity11.class);
                        startActivity(intent10);
                        break;

                    case 11:
                        Intent intent11 = new Intent(getApplicationContext(), activity12.class);
                        startActivity(intent11);
                        break;





                }
            }
        });

    }
}