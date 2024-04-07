package com.example.allan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.allan.R.drawable
import com.example.allan.ui.theme.ALLANTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        
        val mContext = LocalContext.current


        Text(
            text = "WELCOME TO ANDROID",
            color = Color.Red,
            fontSize = 35.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )

        Button(onClick = {
            mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "DESTINATION")

        }

        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = {
            mContext.startActivity(Intent(mContext,ExploreActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "EXPLORE")

        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,WoofActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "WOOF")

        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,LottieActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "ANIMATIONS")

        }

        Spacer(modifier = Modifier.height(10.dp))
        
        Text(text = "eMobilis is the best")

        Spacer(modifier = Modifier.height(10.dp))

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Divider()

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Types of cars",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
        Text(text = "1. BMW")

        //Centering an image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.car),
                contentDescription = "car",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
        }

        Text(text = "2. Mercedes Benz")
        Text(text = "3. Porsche")
        Text(text = "4. Bentley")
        Text(text = "5. Rolls Royce")

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "EPL TABLE",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
        Text(text = "1. Manchester City")
        Text(text = "2. Arsenal")
        Text(text = "3. Manchester United")
        Text(text = "4. Tottenham",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
                         mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Continue")
            
        }




    }


}



@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}