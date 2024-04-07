package com.example.allan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.allan.ui.theme.ALLANTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

            }
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Layout(){

    Column(modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.White)
                    
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)

                }

            }

            )

        //End of TopAppBar

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "TYPES OF CARS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
            )


        //Row 1 start
        Row {

            Image(
                painter = painterResource(id = R.drawable.four),
                contentDescription = "GTR",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "DODGE",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "The Nissan GT-R is a car built by Japanese since 2007. It is considered both a sports car and a grand tourer")
            }
        }
        //Row 1 end

        Spacer(modifier = Modifier.height(5.dp))

        //Row 2 start
        Row {

            Image(
                painter = painterResource(id = R.drawable.two),
                contentDescription = "GTR",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "MASERATI",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "The Nissan GT-R is a car built by Japanese since 2007. It is considered both a sports car and a grand tourer")
            }
        }
        //Row 2 end

        Spacer(modifier = Modifier.height(5.dp))

        //Row 3 start
        Row {

            Image(
                painter = painterResource(id = R.drawable.three),
                contentDescription = "GTR",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "BMW",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "The Nissan GT-R is a car built by Japanese since 2007. It is considered both a sports car and a grand tourer")
            }
        }
        //Row 3 end

        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,IntentActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "INTENT")

        }









    }



}



@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()

}