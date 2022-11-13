package com.example.hellofigma

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hellofigma.frame8.Frame8
import jp.wasabeef.gap.Gap

val tab = arrayOf(1,2,3,4);


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPage(
    onNavigateToDevicePage: () -> Unit,
){
    Row(
        verticalAlignment = Alignment.Top,

    ) {
        Column() {
            Surface(){
                CenterAlignedTopAppBar(
                    title = {
                        Image(
                            painter = painterResource(id = R.drawable.logo),
                            contentDescription = "Logo",
                            modifier = Modifier.height(100.dp),
                            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary)
                        )
                    }
                )
            }
//            Text(
//                text = "Device list",
//                style = MaterialTheme.typography.headlineSmall,
//                modifier = Modifier.padding(30.dp,0.dp)
//            )
            Column(
                modifier = Modifier.padding(26.dp,20.dp)
            ) {
            for (i in tab){
             Card(
                 modifier = Modifier
                     .background(
                         MaterialTheme.colorScheme.surfaceVariant,
                         RoundedCornerShape(16.dp)
                     )
                     .size(width = 800.dp, height = 60.dp),
                 border = BorderStroke(1.dp,MaterialTheme.colorScheme.outlineVariant),
             ) {
             }
                Gap(20.dp)
            }

            }
        }

    }
    }






@Preview
@Composable
fun PreviewListpage(){
    ListPage() {

    }
}


