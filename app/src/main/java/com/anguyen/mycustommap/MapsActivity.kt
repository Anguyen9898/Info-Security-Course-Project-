package com.anguyen.mycustommap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in HCM city Viet Nam and move the camera
        val tpHcm = LatLng(10.82302, 106.62965)

        mMap.addMarker(MarkerOptions().position(tpHcm).title("Marker in HCM city"))

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(tpHcm))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tpHcm, 50f))
    }
}
