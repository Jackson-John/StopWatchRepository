private static final int SECOND=10;
        
        private class TimerListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                DecimalFormat fmt = new DecimalFormat("00");
                tenthSecond++;
                if (tenthSecond == SECOND){
                    Second++;
                    tenthSecond=0;
                    lbSecond.setText ("" + fmt.format(Second));
                }
                lbTenthSecond.setText("" + fmt.format(tenthSecond));
            }
            }