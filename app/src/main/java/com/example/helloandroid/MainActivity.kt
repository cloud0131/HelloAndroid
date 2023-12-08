package com.example.helloandroid

import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloandroid.ui.theme.HelloAndroidTheme
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerApp()
        }

        /*
            HelloAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                  // Greeting("Greeting関数テスト（name変数呼び出し）")
                  // Test("〇")
                  }
                  }
*/
    }
}

/*
@Composable
fun Test(candy: String){
Surface(color = Color.LightGray) {
Text(text = "テストコード$candy"+"チュートリアル6",modifier = Modifier.padding(24.dp))
}    
}
*/
@Preview
@Composable
fun DiceRollerApp(){
    ResultAndButton(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center))

}
@Composable
fun ResultAndButton(modifier: Modifier = Modifier){
    var result by remember { mutableStateOf(1) }
    var imageResource = when(result){
        1 -> R.drawable.oreng
        2 -> R.drawable.tea2
        3 -> R.drawable.four
        4 -> R.drawable.four
        5 -> R.drawable.five
        else -> R.drawable.six
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(imageResource), contentDescription = "1")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..6).random() }) {
            Text(stringResource(R.string.roll))
    }

}

@Composable
fun ResultImage(){


}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column{
    Text(
            text = "Hello World \n  $name",
            modifier = modifier
                .background(Color(0xFFBCE2BD))
                .height(50.dp)
                .width(1000.dp)
    )
    }
}

@Composable
fun GreetingPreview() {
    HelloAndroidTheme {
        Greeting("Android")
    }
}
}