-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2023 at 04:59 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_barang_keluar`
--

CREATE TABLE `data_barang_keluar` (
  `id_keluar` varchar(8) NOT NULL,
  `id_barang` varchar(8) NOT NULL,
  `id_customer` varchar(8) NOT NULL,
  `tgl_keluar` date NOT NULL,
  `qty_keluar` int(11) NOT NULL,
  `harga_satuan` double NOT NULL,
  `total_harga` double NOT NULL,
  `keterangan` varchar(200) NOT NULL,
  `jenis_transaksi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_barang_keluar`
--

INSERT INTO `data_barang_keluar` (`id_keluar`, `id_barang`, `id_customer`, `tgl_keluar`, `qty_keluar`, `harga_satuan`, `total_harga`, `keterangan`, `jenis_transaksi`) VALUES
('OUT-01', 'S-02', 'CST-01', '2023-03-15', 15, 15000, 225000, 'Beli Beras', 'penjualan'),
('OUT-02', 'S-01', 'CST-01', '2023-03-15', 25, 15000, 375000, 'Beli Beras', 'penjualan'),
('ROUT-03', 'S-01', 'CST-01', '2023-03-15', 100, 15000, 1500000, 'Beli Beras', 'retur_penjualan');

-- --------------------------------------------------------

--
-- Table structure for table `data_barang_masuk`
--

CREATE TABLE `data_barang_masuk` (
  `id_masuk` varchar(8) NOT NULL,
  `id_barang` varchar(8) NOT NULL,
  `id_supplier` varchar(8) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `qty_masuk` int(11) NOT NULL,
  `harga_satuan` double NOT NULL,
  `total_harga` double NOT NULL,
  `keterangan` varchar(200) NOT NULL,
  `jenis_transaksi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_barang_masuk`
--

INSERT INTO `data_barang_masuk` (`id_masuk`, `id_barang`, `id_supplier`, `tgl_masuk`, `qty_masuk`, `harga_satuan`, `total_harga`, `keterangan`, `jenis_transaksi`) VALUES
('IN-01', 'S-01', 'SPY-01', '2023-03-12', 10, 12000, 120000, 'Stock Beras', 'pembelian'),
('IN-02', 'S-01', 'SPY-01', '2023-03-12', 100, 12000, 1200000, 'Stock Beras', 'pembelian'),
('IN-03', 'S-02', 'SPY-01', '2023-03-12', 10, 12000, 120000, 'Stock Beras', 'pembelian'),
('RIN-01', 'S-02', 'SPY-01', '2023-03-14', 5, 15000, 75000, 'Beli Beras Merah', 'retur_pembelian'),
('RIN-02', 'S-01', 'SPY-01', '2023-03-12', 10, 12000, 120000, 'Stock Beras', 'retur_pembelian');

-- --------------------------------------------------------

--
-- Table structure for table `data_customer`
--

CREATE TABLE `data_customer` (
  `id_customer` varchar(8) NOT NULL,
  `nama_customer` varchar(150) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `email` varchar(150) NOT NULL,
  `telp` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_customer`
--

INSERT INTO `data_customer` (`id_customer`, `nama_customer`, `alamat`, `email`, `telp`) VALUES
('CST-01', 'Budi Gunawan', 'Jln. Pembangunan 2, Pasar Permai Cikarang', '', '-'),
('CST-02', 'Agung', 'Jln. Medan Merdeka Barat no 2', 'agung@gmail.com', '-');

-- --------------------------------------------------------

--
-- Table structure for table `data_stock`
--

CREATE TABLE `data_stock` (
  `id_barang` varchar(8) NOT NULL,
  `nama_barang` varchar(150) NOT NULL,
  `kategori` varchar(100) NOT NULL,
  `qty_stock` int(11) NOT NULL,
  `harga_satuan` double NOT NULL,
  `total_harga` double NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_stock`
--

INSERT INTO `data_stock` (`id_barang`, `nama_barang`, `kategori`, `qty_stock`, `harga_satuan`, `total_harga`, `status`) VALUES
('B-01', 'Royco Ayam & Sapi (12 Sachet)', 'Bumbu Dapur', 50, 6500, 325000, 'Tersedia'),
('B-02', 'Masako Ayam & Sapi (12 sachet)', 'Bumbu Dapur', 50, 5500, 275000, 'Tersedia'),
('B-03', 'Mamasuka Kentucky (210 gr)', 'Bumbu Dapur', 20, 5000, 100000, 'Tersedia'),
('M-01', 'Aqua Air Mineral 1 Dus (600 ml)', 'Minuman', 10, 50000, 500000, 'Tersedia'),
('M-02', 'Le Minerale 600 ml (1 Dus)', 'Minuman', 10, 50000, 500000, 'Tersedia'),
('M-03', 'Coca Cola 390 ml (1 Dus)', 'Minuman', 10, 65000, 650000, 'Tersedia'),
('MI-01', 'Indomie Goreng 1 Dus (40 pcs)', 'Makanan Instan', 10, 125000, 1250000, 'Tersedia'),
('MI-02', 'Indomie Soto Ayam 1 Dus (40 pcs)', 'Makanan Instan', 10, 125000, 1250000, 'Tersedia'),
('MI-03', 'Indomie Kari Ayam 1 Dus (40 pcs)', 'Makanan Instan', 10, 125000, 1250000, 'Tersedia'),
('MI-04', 'Sedaap Mie Goreng 1 Dus (40 Pcs)', 'Sembako', 10, 122000, 1220000, 'Tersedia'),
('MI-05', 'Sedaap Mie Soto 1 Dus (40 Pcs)', 'Sembako', 10, 122000, 1220000, 'Tersedia'),
('MR-01', 'Better Sandwich Biscuit (20 pcs)', 'Makanan Ringan', 15, 18000, 270000, 'Tersedia'),
('MR-02', 'Beng Beng Wafer 1 Box (20 pcs)', 'Makanan Ringan', 20, 19000, 380000, 'Tersedia'),
('MR-03', 'Roma Malkist Original (125gr)', 'Makanan Ringan', 50, 8600, 430000, 'Tersedia'),
('MR-04', 'Oreo Original (133gr)', 'Makanan Ringan', 30, 8500, 255000, 'Tersedia'),
('MR-05', 'Choki Choki Original (20 pcs)', 'Makanan Ringan', 15, 20000, 300000, 'Tersedia'),
('PM-01', 'Sabun Dettol Original (100 gr)', 'Perlengkapan Mandi & Mencuci', 20, 5000, 100000, 'Tersedia'),
('S-01', 'Beras Putih 1 Kg', 'Sembako', 100, 12000, 1200000, 'Tersedia'),
('S-02', 'Beras Merah 1 Kg', 'Sembako', 50, 15000, 750000, 'Tersedia'),
('S-03', 'Telur Ayam Negeri 1 Kg', 'Sembako', 50, 24000, 1200000, 'Tersedia'),
('S-04', 'Minyak Goreng Bimoli 1 Liter', 'Sembako', 20, 22000, 440000, 'Tersedia'),
('S-05', 'Kopi Kapal Api (165gr)', 'Sembako', 20, 15000, 300000, 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `data_supplier`
--

CREATE TABLE `data_supplier` (
  `id_supplier` varchar(8) NOT NULL,
  `nama_supplier` varchar(150) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `email` varchar(150) NOT NULL,
  `telp` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_supplier`
--

INSERT INTO `data_supplier` (`id_supplier`, `nama_supplier`, `alamat`, `email`, `telp`) VALUES
('SPY-01', 'PT. Sayap Mas Abadi', 'Jl. Pembangunan 1 no 5, Cikarang', '-', '-'),
('SPY-02', 'PT. Cipta Naga Semesta', 'Jl. Diponegoro km38, no 09, rt 02', '-', '-'),
('SPY-03', 'PT. Pinus Merah Abadi', 'Jl. Arief Rahman Hakim no 18', '-', '-');

-- --------------------------------------------------------

--
-- Table structure for table `data_user`
--

CREATE TABLE `data_user` (
  `id_user` varchar(8) NOT NULL,
  `nama_lengkap` varchar(150) NOT NULL,
  `email` varchar(150) NOT NULL,
  `password` varchar(50) NOT NULL,
  `telp` varchar(18) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `tipe_akun` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_user`
--

INSERT INTO `data_user` (`id_user`, `nama_lengkap`, `email`, `password`, `telp`, `alamat`, `tipe_akun`) VALUES
('USR-01', 'Andryan', 'andryan@gmail.com', '12345678', '0812-xxxx-xx13', 'Jln. Hidup Baru gg L no 65', 'Owner'),
('USR-02', 'User', 'user@gmail.com', '12345678', '-', '-', 'User'),
('USR-03', 'Admin', 'admin@gmail.com', '12345678', '-', '-', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_barang_keluar`
--
ALTER TABLE `data_barang_keluar`
  ADD PRIMARY KEY (`id_keluar`);

--
-- Indexes for table `data_barang_masuk`
--
ALTER TABLE `data_barang_masuk`
  ADD PRIMARY KEY (`id_masuk`);

--
-- Indexes for table `data_customer`
--
ALTER TABLE `data_customer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `data_stock`
--
ALTER TABLE `data_stock`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `data_supplier`
--
ALTER TABLE `data_supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `data_user`
--
ALTER TABLE `data_user`
  ADD PRIMARY KEY (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
