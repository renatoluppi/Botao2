package agua.kiko.com.botao2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total_copos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // wire up the button to stuff

        Button botao1 = findViewById(R.id.botao1);

        //wire uo the textoFixo1

        final TextView textoFixo1 = findViewById(R.id.textoFixo1);

        //...get the button
        //..set what happens to button when user clicks

        botao1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                total_copos +=1;
                textoFixo1.setText(String.valueOf(total_copos));
            }
        });


    }
}

//todo gamificar por ex apos 100 copos compre um carrinho, apos 200 copos compre outra coisa
//todo como guardar o valor dos copos mesmo apos fechar o aplicativo
//todo mostrar o total copos por dia e mostrar todas de copos geral total