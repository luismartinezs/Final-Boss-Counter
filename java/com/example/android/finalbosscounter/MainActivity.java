package com.example.android.finalbosscounter;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int playerAtk = 0;
    private int playerHea = 0;
    private int enemyAtk = 0;
    private int enemyHea = 0;
    private int coins = 0;
    private int gems = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
    }

    public void incrementPlayerHea(View view){
        playerHea ++;
        displayPlayerHea(playerHea);
        displayHeaDif();
    }

    public void decrementPlayerHea(View view){
        playerHea --;
        displayPlayerHea(playerHea);
        displayHeaDif();
    }

    public void incrementPlayerAtk(View view){
        playerAtk ++;
        displayPlayerAtk(playerAtk);
        displayHeaDif();
    }

    public void decrementPlayerAtk(View view){
        playerAtk --;
        displayPlayerAtk(playerAtk);
    }

    public void incrementEnemyHea(View view){
        enemyHea ++;
        displayEnemyHea(enemyHea);
        displayHeaDif();
    }

    public void decrementEnemyHea(View view){
        enemyHea --;
        displayEnemyHea(enemyHea);
        displayHeaDif();
    }

    public void incrementEnemyAtk(View view){
        enemyAtk ++;
        displayEnemyAtk(enemyAtk);
        displayHeaDif();
    }

    public void decrementEnemyAtk(View view){
        enemyAtk --;
        displayEnemyAtk(enemyAtk);
        displayHeaDif();
    }

    public void resetPlayer(View view){
        playerAtk = 0;
        playerHea = 0;
        displayPlayerAtk(playerAtk);
        displayPlayerHea(playerHea);
        displayHeaDif();
    }

    public void resetEnemy(View view){
        enemyAtk = 0;
        enemyHea = 0;
        displayEnemyAtk(enemyAtk);
        displayEnemyHea(enemyHea);
        displayHeaDif();
    }

    public void incrementCoins(View view){
        coins ++;
        displayCoins(coins);
    }

    public void decrementCoins(View view){
        if(coins>0) {
            coins--;
        }
        displayCoins(coins);
    }

    public void incrementGems(View view){
            gems++;
        displayGems(gems);
    }

    public void decrementGems(View view){
        if(gems>0) {
            gems--;
        }
        displayGems(gems);
    }

    public void resetCoins(View view){
        coins = 0;
        displayCoins(coins);
    }

    public void resetGems(View view){
        gems = 1;
        displayGems(gems);
    }

    private void displayPlayerHea(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.player_hea_view);
        quantityTextView.setText("" + number);
    }

    private void displayPlayerAtk(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.player_atk_view);
        quantityTextView.setText("" + number);
    }

    private void displayEnemyHea(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.enemy_hea_view);
        quantityTextView.setText("" + number);
    }

    private void displayEnemyAtk(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.enemy_atk_view);
        quantityTextView.setText("" + number);
    }

    private void displayHeaDif(){
        int playerHeaDif = playerHea - enemyAtk;
        int enemyHeaDif = enemyHea - playerAtk;
        TextView quantityTextViewPlayer = (TextView) findViewById(R.id.player_hea_dif_view);
        TextView quantityTextViewEnemy = (TextView) findViewById(R.id.enemy_hea_dif_view);
        if(playerHeaDif <= 0){
            quantityTextViewPlayer.setText("Player dies! Dif: " + playerHeaDif);
            quantityTextViewPlayer.setBackgroundColor(Color.parseColor("#E11755"));
        } else {
            quantityTextViewPlayer.setText("Player lives! Dif: " + playerHeaDif);
            quantityTextViewPlayer.setBackgroundColor(Color.parseColor("#46B615"));
        }
        if(enemyHeaDif <= 0){
            quantityTextViewEnemy.setText("Enemy dies! Dif: " + enemyHeaDif);
            quantityTextViewEnemy.setBackgroundColor(Color.parseColor("#46B615"));
        } else {
            quantityTextViewEnemy.setText("Enemy lives! Dif: " + enemyHeaDif);
            quantityTextViewEnemy.setBackgroundColor(Color.parseColor("#E11755"));
        }
    }

    private void displayCoins(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.coins_view);
        quantityTextView.setText("" + number);
    }

    private void displayGems(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.gems_view);
        quantityTextView.setText("" + number);
    }

}
