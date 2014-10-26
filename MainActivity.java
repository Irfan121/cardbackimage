        ImageView imageView = (ImageView) findViewById(R.id.card_thumbnail_image);
        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.rose);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            //Default 
            imageView.setBackgroundResource(R.drawable.rose);
        } else {
            //RoundCorners 
            RoundCornersDrawable round = new RoundCornersDrawable(mBitmap,
                    getResources().getDimension(R.dimen.cardview_default_radius), 0); //or your custom radius

            CardView cardView = (CardView) findViewById(R.id.card_view);
            cardView.setPreventCornerOverlap(false); //it is very important

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN)
                imageView.setBackground(round);
            else
                imageView.setBackgroundDrawable(round);
        }