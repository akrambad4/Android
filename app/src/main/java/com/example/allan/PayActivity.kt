package com.example.allan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.allan.ui.theme.ALLANTheme

class PayActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pay()

        }
    }
}

@Composable
fun Pay(){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        val mContext = LocalContext.current

        Image(painter = painterResource(id = R.drawable.shopthree),
            contentDescription = "car",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Pay by Cart",
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp,

            )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Find out which documentaries capture truth, life, and reality from the top movies of the form, with each accredited by at least 100 critics. See the list of the 100 best-reviewed documentaries, ranked by Tomatometer, from social experiments to political exposés, from music to history, from comedy to drama.",
            modifier = Modifier.padding(25.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,FurnituresActivity::class.java))
        },
            shape = RoundedCornerShape(25.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Get Started")

        }




    }


}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PayPreview(){
    Pay()
}