-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 12, 2023 at 05:24 PM
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
  `keterangan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_barang_keluar`
--

INSERT INTO `data_barang_keluar` (`id_keluar`, `id_barang`, `id_customer`, `tgl_keluar`, `qty_keluar`, `harga_satuan`, `total_harga`, `keterangan`) VALUES
('OUT-01', 'S-01', 'CST-01', '2023-03-12', 5, 12000, 60000, 'Beli Beras');

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
  `keterangan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_barang_masuk`
--

INSERT INTO `data_barang_masuk` (`id_masuk`, `id_barang`, `id_supplier`, `tgl_masuk`, `qty_masuk`, `harga_satuan`, `total_harga`, `keterangan`) VALUES
('IN-01', 'S-01', 'SPY-01', '2023-03-12', 10, 12000, 120000, 'Stock Beras'),
('IN-02', 'S-01', 'SPY-01', '2023-03-12', 100, 12000, 1200000, 'Stock Beras');

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
('CST-01', 'Budi Gunawan', 'Jln. Medan Merdeka Barat no 2', 'budi@gmail.com', '-');

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
('S-01', 'Beras Putih 1 Kg', 'Sembako', 100, 12000, 1200000, 'Tersedia');

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
('SPY-01', 'PT. Unilever Indonesia', 'Jl. Jatinegara Barat no.10', 'unilever@gmail.com', '-');

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
('USR-01', 'Andryan', 'andryan@gmail.com', '12345678', '0812-xxxx-xx12', 'Jln. Hidup Baru gg L no 65', 'Owner');

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
