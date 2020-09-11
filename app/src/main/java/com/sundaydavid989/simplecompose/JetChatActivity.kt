package com.sundaydavid989.simplecompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.input.KeyboardType
import androidx.ui.tooling.preview.Preview
import com.sundaydavid989.simplecompose.ui.typography


class JetChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetChat()
        }
    }
}


@Composable
 fun JetChat(){
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally
    ) {
            OutlinedTextField(
                    value = text,
                    onValueChange = {text = it},
                    label = {Text("Label")},
                    keyboardType = KeyboardType.Text,
                    textStyle = typography.body1
            )
            if (text.isEmpty()) {
                Text("")
            }

        Text("Ali Conors")
        Text("3:50 PM")
        Text(
                " the JetNews sample "
        )
    }
    }

@Preview
@Composable
fun PreviewJetChat(){
    JetChat()
}

