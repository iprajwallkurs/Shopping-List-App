package com.example.myshoppinglistapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun LocationSelectionScreen(
    location: LocationData,
    onLocationSelected: (LocationData) -> Unit){

    val userlocation = remember{
        mutableStateOf(LatLng(location.latitude, location.longitude))
    }

    val cameraPositionState = rememberCameraPositionState{
        position = CameraPosition.fromLatLngZoom(userlocation.value, 10f)
    }



}