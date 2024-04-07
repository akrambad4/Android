package com.example.allan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.allan.ui.theme.ALLANTheme

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()

        }
    }
}

@Composable
fun Woof(){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {

        val mContext = LocalContext.current

        Spacer(modifier = Modifier.height(20.dp))

        //PAW START

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {
            Row {
                Image(painter = painterResource(id = R.drawable.paw),
                    contentDescription = "paw")

                Spacer(modifier = Modifier.width(10.dp))

                Text(text = "Woof",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace)

            }

        }

        //PAW END

        // Dog 1
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
            )
            {
                Row {
                    Image(painter = painterResource(id = R.drawable.dogone),
                        contentDescription = "Koda",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(text = "Koda",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "2 years old",
                            fontSize = 15.sp,
                        )
                    }
                }
            }
        }

        // Dog 1 END

        // Dog 2
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
            )
            {
                Row {
                    Image(painter = painterResource(id = R.drawable.dogtwo),
                        contentDescription = "Lola",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(text = "Lola",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "16 years old",
                            fontSize = 15.sp,
                        )

                    }

                }

            }
        }

        // Dog 2 END

        // Dog 3
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
            )
            {
                Row {
                    Image(painter = painterResource(id = R.drawable.dogthree),
                        contentDescription = "Frankie",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(text = "Frankie",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "2 years old",
                            fontSize = 15.sp,
                        )

                    }

                }

            }
        }

        // Dog 3 END

        // Dog 4
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
            )
            {
                Row {
                    Image(painter = painterResource(id = R.drawable.dogfour),
                        contentDescription = "Nox",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(text = "Nox",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "8 years old",
                            fontSize = 15.sp,
                        )

                    }

                }

            }
        }

        // Dog 4 END

        // Dog 5
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
            )
            {
                Row {
                    Image(painter = painterResource(id = R.drawable.dogfive),
                        contentDescription = "Faye",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(text = "Faye",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "8 years old",
                            fontSize = 15.sp,
                        )

                    }

                }

            }
        }

        // Dog 5 END

        // Dog 6
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
            )
            {
                Row {
                    Image(painter = painterResource(id = R.drawable.dogsix),
                        contentDescription = "Bella",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(text = "Bella",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "14 years old",
                            fontSize = 15.sp,
                        )

                    }

                }

            }
        }

        // Dog 6 END

        // Dog 7
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
            )
            {
                Row {
                    Image(painter = painterResource(id = R.drawable.dogseven),
                        contentDescription = "Moana",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(text = "Moana",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "2 years old",
                            fontSize = 15.sp,
                        )

                    }

                }

            }
        }

        // Dog 7 END

        // Dog 8
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
            )
            {
                Row {
                    Image(painter = painterResource(id = R.drawable.dogeight),
                        contentDescription = "Tzeitel",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column {
                        Text(text = "Tzeitel",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "7 years old",
                            fontSize = 15.sp,
                        )

                    }

                }

            }
        }

        // Dog 8 END











    }






}

@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()
}