package com.example.allan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.allan.ui.theme.Indigo

class FurnituresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Furnitures()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Furnitures(){

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(color = Indigo)

    ) {

        val mContext = LocalContext.current

        //TopAppBar

        TopAppBar(title = { Text(text = "", color = Color.Black) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Indigo),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.Black)

                }
            },
            actions = {
                IconButton(onClick = {  }) {
                    Icon(imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "share",
                        tint = Color.Black)

                }

                IconButton(onClick = {  }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "Main",
                        tint = Color.Black)

                }


            }

        )

        //End of TopAppBar


        //Header start
        Row(modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 25.dp)
            ,) {

            Text(text = "Chairs",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            )

            Spacer(modifier = Modifier.width(30.dp))

            Text(text = "Tables",
                fontSize = 30.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.width(30.dp))

            Text(text = "Sofa",
                fontSize = 30.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.width(30.dp))

            Text(text = "Beds",
                fontSize = 30.sp,
                color = Color.Gray
            )

        }

        //Header end


        Spacer(modifier = Modifier.height(30.dp))


        //ROW 1 START

        Row (modifier = Modifier
            .padding(start = 10.dp)
        ) {

            //Column START

            Column {

                Card(modifier = Modifier
                    .height(250.dp)
                    .width(160.dp)
                ) {

                    Box (modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.amos),
                            contentDescription = "Amos Chair",
                            modifier = Modifier.padding(top = 15.dp)
                        )

                    }

                    Text(text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Furnitures shown",
                        modifier = Modifier.padding(start = 10.dp),
                        fontSize = 10.sp
                        )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$680",
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.width(70.dp))

                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "share",
                                tint = Color.Gray)


                        }

                    }




                }

            }

            //Column END


            Spacer(modifier = Modifier.width(10.dp))


            //Column START

            Column {

                Card(modifier = Modifier
                    .height(250.dp)
                    .width(160.dp)
                ) {

                    Box (modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.kew),
                            contentDescription = "Kew Chair",
                            modifier = Modifier.padding(top = 15.dp)
                        )

                    }

                    Text(text = "Kew Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Furnitures shown",
                        modifier = Modifier.padding(start = 10.dp),
                        fontSize = 10.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$580",
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.width(70.dp))

                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "share",
                                tint = Color.Gray)


                        }

                    }



                }

            }

            //Column END


        }


        //ROW 1 END

        Spacer(modifier = Modifier.height(20.dp))

        //ROW 2 START

        Row (modifier = Modifier
            .padding(start = 10.dp)
        ) {

            //Column START

            Column {

                Card(modifier = Modifier
                    .height(250.dp)
                    .width(160.dp)
                ) {

                    Box (modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.buro),
                            contentDescription = "Buro Chair",
                            modifier = Modifier.padding(top = 15.dp)
                        )

                    }

                    Text(text = "Buro Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Furnitures shown",
                        modifier = Modifier.padding(start = 10.dp),
                        fontSize = 10.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$680",
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.width(70.dp))

                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "share",
                                tint = Color.Gray)


                        }

                    }




                }

            }

            //Column END

            Spacer(modifier = Modifier.width(10.dp))


            //Column START

            Column {

                Card(modifier = Modifier
                    .height(250.dp)
                    .width(160.dp)
                ) {

                    Box (modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.tinar),
                            contentDescription = "Tinar Chair",
                            modifier = Modifier.padding(top = 15.dp)
                        )

                    }

                    Text(text = "Tinar Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Furnitures shown",
                        modifier = Modifier.padding(start = 10.dp),
                        fontSize = 10.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$480",
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.width(70.dp))

                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "share",
                                tint = Color.Gray)


                        }

                    }



                }

            }

            //Column END


        }


        //ROW 2 END

        Spacer(modifier = Modifier.height(20.dp))

        //ROW 3 START

        Row (modifier = Modifier
            .padding(start = 10.dp)
        ) {

            //Column START

            Column {

                Card(modifier = Modifier
                    .height(250.dp)
                    .width(160.dp)
                ) {

                    Box (modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.three),
                            contentDescription = "Amos Chair",
                            modifier = Modifier.padding(top = 15.dp)
                        )

                    }

                    Text(text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Furnitures shown",
                        modifier = Modifier.padding(start = 10.dp),
                        fontSize = 10.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$680",
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.width(70.dp))

                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "share",
                                tint = Color.Gray)


                        }

                    }




                }

            }

            //Column END

            Spacer(modifier = Modifier.width(10.dp))


            //Column START

            Column {

                Card(modifier = Modifier
                    .height(250.dp)
                    .width(160.dp)
                ) {

                    Box (modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center)
                    {
                        Image(
                            painter = painterResource(id = R.drawable.two),
                            contentDescription = "Kew Chair",
                            modifier = Modifier.padding(top = 15.dp)
                        )

                    }

                    Text(text = "Kew Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Furnitures shown",
                        modifier = Modifier.padding(start = 10.dp),
                        fontSize = 10.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        Text(text = "$580",
                            modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.width(70.dp))

                        IconButton(onClick = {  }) {
                            Icon(imageVector = Icons.Default.ShoppingCart,
                                contentDescription = "share",
                                tint = Color.Gray)


                        }

                    }



                }

            }

            //Column END


        }


        //ROW 3 END

        Spacer(modifier = Modifier.height(20.dp))










    }

}





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FurnituresPreview(){
    Furnitures()
}