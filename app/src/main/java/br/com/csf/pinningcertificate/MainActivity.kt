package br.com.csf.pinningcertificate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.csf.pinningcertificate.ui.theme.PinningCertificateTheme
import coil.compose.rememberAsyncImagePainter

@Composable
fun Layout() {
    Column {
        Image(
            painter = rememberAsyncImagePainter("https://conteudo.imguol.com.br/c/parceiros/31/2022/02/23/o-elenco-de-friends-1645627274484_v2_900x506.jpg"),
            contentDescription = null,
            modifier = Modifier.size(1000.dp)
        )

    }
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {
                Layout();
            }
        }
    }
}

